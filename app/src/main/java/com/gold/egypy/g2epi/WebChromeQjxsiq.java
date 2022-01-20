package com.gold.egypy.g2epi;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.RequiresApi;

public class WebChromeQjxsiq extends WebChromeClient {

    private GE ge;

    public WebChromeQjxsiq(GE ge) {
        this.ge = ge;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public boolean onShowFileChooser(WebView view,
                                     ValueCallback<Uri[]> filePath,
                                     FileChooserParams fileChooserParams) {

        if (ge.hhuuew != null) {
            ge.hhuuew.onReceiveValue(null);
        }
        ge.hhuuew = filePath;
        Intent contentSelectionIntent = new Intent(Intent.ACTION_GET_CONTENT);
        contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE);
        contentSelectionIntent.setType("*/*");
        Intent[] intentArray = new Intent[0];
        Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
        chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent);
        chooserIntent.putExtra(Intent.EXTRA_TITLE, GE.dddddeeekkk("U2VsZWN0IE9wdGlvbjo="));
        chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray);
        ge.startActivityForResult(chooserIntent, 1);
        return true;
    }
}
