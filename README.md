# Xposed Translate Text

**Auto-translate app text using Local Cache first, then [Gemini API](https://ai.google.dev/gemini-api/docs/pricing?hl=zh-tw#gemini-2.0-flash-lite), with fallback to [Free Google API](https://github.com/ssut/py-googletrans/issues/268)**

## 📥 Download

[**Download the Latest APK**](https://github.com/tianci-sh/XPTranslateText/actions/workflows/build.yml)
> Select the latest successful workflow run and download the APK from the **Artifacts** section.

## 📦 **Installation & Setup**

### Requirements
- [LSPosed](https://github.com/LSPosed/LSPosed) or another **Xposed Framework** variant must be installed and enabled.

### Installation Steps

1. Install the downloaded APK from the link above.
2. Open the **LSPosed Manager app**, navigate to **Modules**, and enable **XPTranslateText**.
3. Select the apps you want to translate from the module settings in LSPosed.
4. Kill your app and restart it.

After restart, the selected apps should display translated text automatically.

## 🛠️ Hook Methods & Translation Workflow
- **android.widget.TextView & Custom Components:**
  - Automatically translates text set via the `setText()` method.
  - Translation is prioritized using:
    1. **Local Translation Cache**: Speeds up translation by caching previously translated texts locally.
    2. **Gemini API (gemini-2.0-flash-lite)**: Uses Google's Gemini API for translations first, with a fallback to the Free Google API when needed.
    3. **Free Google API**

- **android.webkit.WebView:**
  - Performs real-time translation of entire webpage content.
  - Exclusively uses the **Free Google API** due to the dynamic nature of web content.

## ✅ **Compatibility**
- Tested and confirmed working on:
    - Android 13 with LSPosed
    - Android 15 with LSPosed

## 🖼️ **Before & After Comparison**

| Before                                    | After                                    |
|-------------------------------------------|------------------------------------------|
| <img src="images/before.png" width="300"> | <img src="images/after.png" width="300"> |

## 📁 **Project Structure**

```text
XPTranslateText/
├── app/
│   ├── key.jks              # Generated by GitHub Actions
│   └── build.gradle
├── gradlew
├── gradlew.bat
├── keystore.properties      # Local-only, not committed
└── settings.gradle
```

## Star History

[![Star History Chart](https://api.star-history.com/svg?repos=tianci-sh/XPTranslateText&type=Date)](https://www.star-history.com/#tianci-sh/XPTranslateText&Date)