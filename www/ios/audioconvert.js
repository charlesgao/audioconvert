//
//  AudioConvert.js
//


 // This class converts audio at a file path to M4A format

 window.encodeAudio = function(originalSrc, successCallback, failCallback) {

     cordova.exec(successCallback, // success callback function
                  failCallback, // error callback function
                  "AudioConvert", // mapped to our native ios class called "AudioConvert"
                  "convertAudio",// with this ios function name
                  [originalSrc]);
 };