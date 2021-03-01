# Vulnerable Web View
Intentionally vulnerable webview implementions in Android

## Added vulnerabilities
1. Basic webview hijack with attacker controlled URL in `RegistrationWebView.java`
2. JavaScript execution in `SupportWebView.java`
3. Local file access in `RegistrationWebView.java`

## How to install
- If you want, you can clone this repository into  Android Studio, or you can simply download the `app-debug.apk` and install it on your device.

## TODO
1. Add vulnerability due to `setAllowFileAccessFromFileURLs()`
