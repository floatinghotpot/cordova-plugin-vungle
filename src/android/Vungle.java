package com.rjfun.cordova.vungle;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.vungle.publisher.VunglePub;

import com.rjfun.cordova.ad.GenericAdPlugin;

public class VunglePlugin extends GenericAdPlugin {
  private static final String LOGTAG = "Vungle";

  private static final String TEST_APPID = "542f7bb4ba288b5605000028";
  private String appId = TEST_APPID;
  
  private boolean bVungleInited = false;
  final VunglePub vunglePub = VunglePub.getInstance();

  @Override
  protected void pluginInitialize() {
    super.pluginInitialize();
  }

  @Override
  protected String __getProductShortName() {
    return "Vungle";
  }

  @Override
  protected String __getTestBannerId() {
    return TEST_APPID;
  }

  @Override
  protected String __getTestInterstitialId() {
    return TEST_APPID;
  }

  @Override
  protected String __getTestRewardVideoId() { 
    return TEST_APPID; 
  }
  
  @Override
  public void setOptions(JSONObject options) {
    super.setOptions(options);
  }
  
  @Override
  protected Object __createInterstitial(String adId) {
    if(! bVungleInited) {
      vunglePub.init(getActivity(), adId);
    }
    return adId;
  }
  
  @Override
  protected void __loadInterstitial(Object interstitial) {
  }
  
  @Override
  protected void __showInterstitial(Object interstitial) {
    //if(vunglePub.isAdPlayable())
    vunglePub.playAd();
  }
  
  @Override
  protected void __destroyInterstitial(Object interstitial) {
  }

  @Override
  protected Object __prepareRewardVideoAd(String adId) {
    if(! bVungleInited) {
      vunglePub.init(getActivity(), adId);
    }
    return adId;
  }
  
  @Override
  protected void __showRewardVideoAd(Object rewardvideo) {
    //if(vunglePub.isAdPlayable())
    vunglePub.playAd();
  }

  @Override
  public void onPause(boolean multitasking) {
    if (vunglePub != null) {
      vunglePub.onPause();
    }
    super.onPause(multitasking);
  }

  @Override
  public void onResume(boolean multitasking) {
    super.onResume(multitasking);
    if (vunglePub != null) {
      vunglePub.onResume();
    }
  }

  @Override
  public void onDestroy() {
    if (vunglePub != null) {
      vunglePub = null;
    }
    super.onDestroy();
  }
}

