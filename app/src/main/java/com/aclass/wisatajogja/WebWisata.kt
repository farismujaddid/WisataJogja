package com.aclass.wisatajogja

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar

class WebWisata : Fragment() {

    lateinit var webView: WebView
    lateinit var progressBar: ProgressBar

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_web_wisata,null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        webView=view.findViewById(R.id.webview)
        progressBar=view.findViewById(R.id.pb)
        webView.settings.javaScriptEnabled = true
        webView.settings.saveFormData = true
        webView.webViewClient = WebViewClient()
        webView.webChromeClient=object :WebChromeClient(){
            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                super.onProgressChanged(view, newProgress)
                if (newProgress==100){
                    progressBar.visibility=View.GONE
                }
            }
        }
        webView.loadUrl("https://www.ngopibareng.id/timeline/category/pesona-indonesia")
    }
}
