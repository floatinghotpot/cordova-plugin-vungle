# cordova-plugin-vungle #

Present video Ad with vungle in Mobile App/Games natively from JavaScript. 

Highlights:
- [x] Display video Ad with single line of Js code.
- [x] One plugin supports both Android and iOS platform.

Compatible with:

* Cordova CLI, v3.5+
* Intel XDK and Crosswalk, r1095+
* IBM Worklight, v6.2+

## How to use? ##

If use with Cordova CLI:
```
cordova plugin add cordova-plugin-vungle
```

## Quick Start Example Code ##

Step 1: Prepare your Vungle App Id for your app, create it in [Vungle website](http://www.vungle.com/)

```javascript
var ad_units = {
  ios : "542f7adb9a76df343f00020e",
  android : "542f7bb4ba288b5605000028"
};

// select the right Ad Id according to platform
var adid = ( /(android)/i.test(navigator.userAgent) ) ? ad_units.android : ad_units.ios;

if(Vungle) Vungle.prepareRewardVideoAd(adId);

```

Step 2: Play the video ad when needed

```javascript
// show the interstitial later, e.g. at end of game level
if(Vungle) Vungle.showRewardVideoAd();
```

## Javascript API Overview ##

Methods:
```javascript
// for reward video ad
prepareRewardVideoAd(adId);
showRewardVideoAd();
```

## Detailed Documentation ##

The APIs, Events and Options are detailed documented.

Read the detailed API Reference Documentation [English](https://github.com/floatinghotpot/cordova-plugin-vungle/wiki).

## FAQ ##

If encounter problem when using the plugin, please read the [FAQ](https://github.com/floatinghotpot/cordova-plugin-vungle/wiki/FAQ) first.

## Full Example Code ##

This Vungle Plugin Pro offers the most flexibility and many options.

Check the [test/index.html] (https://github.com/floatinghotpot/cordova-plugin-vungle/blob/master/test/index.html).

## Screenshots ##

Coming soon.

## License

You can use this plugin for free during trial purpose. If it earns less than $1000 for you, you can continue to use for free. 

If use in commercial project, please [get a license](http://rjfun.github.io/), or, you have monetized more than $1000 using this plugin, you are also required to: either get a commercial license ($20), or, no need pay but share 2% Ad traffic, read the [License Agreement](https://github.com/floatinghotpot/cordova-admob-pro/wiki/License-Agreement) for details. As a commercial customer, you will be supported with high priority, via private email or even Skype chat.

If you hope to get a fully open source plugin (either need DIY, or hope to get full control on the code), use this open source one instead. Fork and pull request is welcome, but please mention it's derived source. Simply renaming then publishing to npm is forbidden. Open source project URL:
https://github.com/floatinghotpot/cordova-plugin-admob

## Credits

This project is created and maintained by Raymond Xie.

More Cordova/PhoneGap plugins by Raymond Xie, [find them in plugin registry](http://plugins.cordova.io/#/search?search=rjfun), or [find them in npm](https://www.npmjs.com/~floatinghotpot).

Project outsourcing and consulting service is also available. Please [contact us](mailto:rjfun.mobile@gmail.com) if you have the business needs.
