//
//  CDVVungle.h
//  TestAdMobCombo
//
//  Created by Xie Liming on 2016-12-21
//
//

#import "GenericAdPlugin.h"

@interface CDVVunglePlugin : GenericAdPlugin

- (void)pluginInitialize;

- (void) parseOptions:(NSDictionary *)options;
- (void) __showBanner:(int) position atX:(int)x atY:(int)y;

- (NSString*) __getProductShortName;
- (NSString*) __getTestBannerId;
- (NSString*) __getTestInterstitialId;

- (NSObject*) __createInterstitial:(NSString*)adId;
- (void) __loadInterstitial:(NSObject*)interstitial;
- (void) __showInterstitial:(NSObject*)interstitial;
- (void) __destroyInterstitial:(NSObject*)interstitial;

- (NSObject*) __prepareRewardVideoAd:(NSString*)adId;
- (BOOL) __showRewardVideoAd:(NSObject*)rewardvideo;

@end
