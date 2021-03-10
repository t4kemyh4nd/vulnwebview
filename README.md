# Vulnerable Web View
Intentionally vulnerable webview implementions in Android

## Added vulnerabilities
1. Basic webview hijack with attacker controlled URL in `RegistrationWebView.java`
2. User token leaked to attacker via header and JavaScript interface in `SupportWebView.java` ( exploit hosted [here](https://recon.takemyhand.xyz/getusertoken.html) )
3. Universal file access allowed in `RegistrationWebView.java` ( exploit hosted [here](https://recon.takemyhand.xyz/fileaccess.html) )

## How to install
- If you want, you can clone this repository into  Android Studio, or you can simply download the `app-debug.apk` and install it on your device.
