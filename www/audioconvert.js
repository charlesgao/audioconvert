var calendar = {
    createEvent: function(title, successCallback, errorCallback) {
    	  cordova.exec(
            successCallback, // success callback function
            errorCallback, // error callback function
            'AudioConvert', // mapped to our native Java class called "AudioConvert"
            'addAudioConvertEntry', // with this action name
            [{                  // and this array of custom arguments to create our entry
                "title": title
            }]
        ); 
    }
}
module.exports = audioconvert;