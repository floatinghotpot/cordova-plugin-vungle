
var argscheck = require('cordova/argscheck'),
  exec = require('cordova/exec');

var vungleExport = {};

vungleExport.prepareInterstitial = function(args, successCallback, failureCallback) {
  var options = {};
  if(typeof args === 'object') {
    for(var k in args) {
      if(k === 'success') { if(args[k] === 'function') successCallback = args[k]; }
      else if(k === 'error') { if(args[k] === 'function') failureCallback = args[k]; }
      else {
        options[k] = args[k];
      }
    }
  } else if(typeof args === 'string') {
    options = { adId: args };
  }
  cordova.exec( successCallback, failureCallback, 'Vungle', 'prepareInterstitial', [ options ] );
};

vungleExport.showInterstitial = function(successCallback, failureCallback) {
  cordova.exec( successCallback, failureCallback, 'Vungle', 'showInterstitial', [] );
};

vungleExport.prepareRewardVideoAd = function(args, successCallback, failureCallback) {
  var options = {};
  if(typeof args === 'object') {
    for(var k in args) {
      if(k === 'success') { if(args[k] === 'function') successCallback = args[k]; }
      else if(k === 'error') { if(args[k] === 'function') failureCallback = args[k]; }
      else {
        options[k] = args[k];
      }
    }
  } else if(typeof args === 'string') {
    options = { adId: args };
  }
  cordova.exec( successCallback, failureCallback, 'Vungle', 'prepareRewardVideoAd', [ options ] );
};

vungleExport.showRewardVideoAd = function(successCallback, failureCallback) {
  cordova.exec( successCallback, failureCallback, 'Vungle', 'showRewardVideoAd', [] );
};

module.exports = vungleExport;

