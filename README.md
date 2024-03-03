# IpAtlasReaderSDK
The IpAtlasReaderSDK is a Java-based project that provides functionalities for resolving IP addresses to geolocation data. It uses a database of IP addresses and their corresponding geolocation information, which can be downloaded and updated automatically using a provided license key. The SDK offers a simple interface for querying IP addresses and retrieving detailed geolocation data, including information about the internet service provider. This SDK is a powerful tool for any application that requires IP-based geolocation capabilities.

## Installation
To install the IpAtlasReaderSDK, follow these steps:
1. Add the GitHub Maven repository to your build.gradle file:
```
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/IpAtlas/IpAtlasReaderSDK")
        credentials {
            username = 'your-github-username'
            password = 'your-github-token'
        }
    }
}
```
Replace your-github-username and your-github-token with your GitHub username and personal access token.

2. Add the IpAtlasReaderSDK dependency to your build.gradle file:
```
dependencies {
    implementation("net.ipatlas:ipatlasreadersdk:<version>")
}
```
Replace [version](https://github.com/IpAtlas/IpAtlasReaderSDK/packages/2085710) of the IpAtlasReaderSDK you want to use.

3. Run the following command in your terminal to download and install the IpAtlasReaderSDK:
```
./gradlew build
```
4. Now, you can import and use the IpAtlasReaderSDK in your Java or Kotlin files
```
import com.github.username.IpAtlasReaderSDK;
```
For more details on how to use the SDK Reader, see the example [project](https://github.com/IpAtlas/IpAtlasReaderSDK/tree/main/SdkConsumerExample/src/main/java/org/example) and the Wiki page for more details.

## Usage
The "Usage" section guides how to utilize the IpAtlasReaderSDK effectively. It covers everything from setting up the SDK in your project to making IP geolocation queries. For comprehensive instructions and examples, please visit our [Wiki](https://github.com/IpAtlas/IpAtlasReaderSDK/wiki) page. There, you'll find detailed information and step-by-step guides to help you get the most out of the IpAtlasReaderSDK.

## Report an Issue
If you encounter any issues while using the IpAtlasReaderSDK, we encourage you to report them. Please create a new issue in the GitHub repository, providing as much detail as possible. This includes the steps to reproduce the issue, the expected and actual results, and any error messages. If possible, include a minimal code sample that demonstrates the problem. This will help us to understand and resolve the issue more quickly. 

Thank you for your contribution to improving the IpAtlasReaderSDK.

## Get a License key
The "IP Atlas Service" is a robust and reliable solution for IP-based geolocation. It offers a comprehensive database of IP addresses and their corresponding geolocation information. This service is ideal for applications that require accurate and up-to-date geolocation data. For detailed instructions on how to use this service, please visit the official website at www.ipatlas.net.
