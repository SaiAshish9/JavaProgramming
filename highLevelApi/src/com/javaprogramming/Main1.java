package com.javaprogramming;

//A URI is an identifier of a
// specific resource. ... Like a
// page, or book, or a document
// that might not provide
// information about how to access it
// .
// A URL is special type of identifier
// that also tells you how to access
// it, such as HTTPs , FTP , etc.

// scheme is a part of URI or URL
// that appears before colon "http" "https" "ftp"

// when working with low level API we use
// socket,serverSocket,DiagramSocket
// with high-level Api we use
// URI URL URLConnection HttpURLConnection

// URI contains
// scheme scheme-specific part authority
// user-info host port path query fragment

//  scheme:[//[user[:password]@host[:port]][/path][?query][#fragment]

// URIs that specify a scheme are called
// absolute URIS
// else relative URIs

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.List;
import java.util.Map;

public class Main1 {

    public static void main(String[] args) {

//    try{
//        URI uri=new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#sumsung");

//        URI baseUri=new URI("https://abc.com");
//        URI uri1=new URI("/categories");
//        URI uri2=new URI("/catalogue");

//        URI resolvedUri=baseUri.resolve(uri1);
//        URL url1=resolvedUri.toURL();
//        System.out.println(url1);
//        System.out.println(uri);
//        URI relativizedUri=baseUri.relativize(uri1);
//        System.out.println(relativizedUri);

//        URL url=new URL("https://example.org");
//        URI uri=url.toURI();
//        System.out.println(uri.getScheme());

        try{
            URL url=new URL("https://example.org");
            HttpURLConnection connection=(HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent","Chrome");
            connection.setReadTimeout(30000);

            int responseCode = connection.getResponseCode();
            System.out.println(responseCode);



//            URLConnection urlConnection=url.openConnection();
//            urlConnection.setDoOutput(true);
//            urlConnection.connect();

            BufferedReader inputReader=new BufferedReader(
//              new InputStreamReader(url.openStream())
                    new InputStreamReader(connection.getInputStream())
            );

//            Map<String, List<String>> headerFields=urlConnection.getHeaderFields();

//            for(Map.Entry<String,List<String>> entry:headerFields.entrySet()){
//                String key=entry.getKey();
//                List<String> value=entry.getValue();
//                System.out.println(key);
//                for (String string:value) {
//                    System.out.println(string);
//                }
//            }

            String line;
            while ((line=inputReader.readLine())!=null){
//                line=inputStream.readLine();
                System.out.println(line);
            }
            inputReader.close();


        }catch (IOException e){
            System.out.println(e.getMessage());
        }

//        System.out.println(
//                uri.getScheme()+
//                        "\n" +
//                        uri.getAuthority()
//        + "\n" + uri.getSchemeSpecificPart() + "\n" +uri.getUserInfo()
//        + "\n" + uri.getHost()+ "\n" +uri.getPath() + "\n" +uri.getPort() + "\n" + uri.getQuery()
//                        + "\n" + uri.getFragment()
//        );

//    catch (URISyntaxException e){
//
//    }catch (MalformedURLException e){
//        System.out.println(e.getMessage());
//    }


    }
}
