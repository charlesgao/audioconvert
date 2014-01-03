package com.dextrys.pgplugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import android.app.Activity;
import android.content.Intent;

public class AudioConvert extends CordovaPlugin {
    public static final String ACTION_ADD_AUDIO_CONVERT_ENTRY = "addAudioConvertEntry"; 
    
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callback throws JSONException {
    	   try {
             /*if (ACTION_ADD_AUDIO_CONVERT_ENTRY.equals(action)) { 
                 JSONObject arg_object = args.getJSONObject(0);
                 Intent calIntent = new Intent(Intent.ACTION_EDIT)
                   .setType("vnd.android.cursor.item/event")
                   .putExtra("title", arg_object.getString("title"));
 
                 this.cordova.getActivity().startActivity(calIntent);
                 callbackContext.success();*/
                 //nothing for now. As no andriod code is need.
                 return true;
             }
             callbackContext.error("Invalid action");
             return false;
         } catch(Exception e) {
             System.err.println("Exception: " + e.getMessage());
             callbackContext.error(e.getMessage());
             return false;
         } 

    }
}