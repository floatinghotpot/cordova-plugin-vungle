
#import "CDVVungle.h"

#define TEST_APPID           @"542f7adb9a76df343f00020e"

@interface CDVAdMobPlugin()<VungleSDKDelegate>

@property (assign) BOOL bVungleInited;

@end

@implementation CDVAdMobPlugin

- (void)pluginInitialize
{
  [super pluginInitialize];
  
  [[VungleSDK sharedSDK] setDelegate:self];
  bVungleInited = false;
}

- (void)onAppTerminate {
  [[VungleSDK sharedSDK] setDelegate:nil];
}
  
- (NSString*) __getProductShortName { 
  return @"Vungle"; 
}
- (NSString*) __getTestBannerId {
    return TEST_APPID;
}
- (NSString*) __getTestInterstitialId {
    return TEST_APPID;
}
- (NSString*) __getTestRewardVideoId { 
  return TEST_APPID; 
}

- (void) parseOptions:(NSDictionary *)options
{
  [super parseOptions:options];
}

- (NSObject*) __createInterstitial:(NSString*)adId {
  if(! bVungleInited) {
    VungleSDK* sdk = [VungleSDK sharedSDK];
    [sdk startWithAppId:adId];
  }
  return adId;
}

- (void) __loadInterstitial:(NSObject*)interstitial {
}

- (void) __showInterstitial:(NSObject*)interstitial {
  VungleSDK* sdk = [VungleSDK sharedSDK];
  NSError *error;
  [sdk playAd:self error:&error];
}

- (void) __destroyInterstitial:(NSObject*)interstitial {
}

- (NSObject*) __prepareRewardVideoAd:(NSString*)adId {
  if(! bVungleInited) {
    VungleSDK* sdk = [VungleSDK sharedSDK];
    [sdk startWithAppId:adId];
  }
  return nil;
}

- (BOOL) __showRewardVideoAd:(NSObject*)rewardvideo {
  VungleSDK* sdk = [VungleSDK sharedSDK];
  NSError *error;
  [sdk playAd:self error:&error];
  return false;
}

- (void)vungleSDKAdPlayableChanged:(BOOL)isAdPlayable {
}

- (void)vungleSDKwillShowAd {
}

- (void)vungleSDKwillCloseAdWithViewInfo:(NSDictionary*)viewInfo willPresentProductSheet:(BOOL)willPresentProductSheet {
}

- (void)vungleSDKwillCloseProductSheet:(id)productSheet {
}

@end
