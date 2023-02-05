package com.example.materialdesignspeech.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import com.example.materialdesignspeech.R;

public class WebFragment extends Fragment {

    private final String URL = "https://www.google.com";
    WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceSate){
        View view = inflater.inflate(R.layout.web_fragment_layout, container, false);
        webView = view.findViewById(R.id.webView);
        if(webView != null){
            webView.loadUrl(URL);
            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    view.loadUrl(URL);
                    return true;
                }
            });
        }
        return view;
    }
}
