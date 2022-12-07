package onecircle.core.clients;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Component;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import onecircle.core.util.ResultBody;
import java.io.IOException;
import java.util.ArrayList;


/**
 * Logic App Client
 * @author Siddharth Kandimalla
 */
@Slf4j
@Component
public class LogicAppClient {

  /**
   * HttpClient implementations are expected to be thread safe. Reuse is
   * recommended.
   * https://hc.apache.org/httpcomponents-client-ga/tutorial/html/fundamentals.html#d5e213
   */
  private static HttpClient httpClient;

  /**
   * Initialize the httpClient with connection settings.
   */
  public LogicAppClient() {

    initalizeHttpClient();
  }

  /**
   * Init the http client used for communicating with LogicApp
   */
  private synchronized void initalizeHttpClient() {
    if (httpClient == null) {
      RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(10000).setConnectTimeout(10000)
          .setConnectionRequestTimeout(10000).build();

      httpClient = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).build();
    }
  }

  /**
   * Post jsonObject to submit API
   * 
   * @param jsonObject The json object you want to send
   * @return The result
   * @throws IOException
   */
  public String submit(String url, ResultBody resultBody) throws IOException {
    return post(url, resultBody);
  }

  /**
   * Send a POST request to url with jsonObject
   *
   * @param url        The target url
   * @param jsonObject The request body
   * @return The request result
   * @throws ClientProtocolException
   * @throws IOException
   */
  private String post(String url, ResultBody resultBody) throws ClientProtocolException, IOException {

    HttpPost httpPost = new HttpPost(url);
    ArrayList<BasicNameValuePair> postParameters = Lists
        .newArrayList(new BasicNameValuePair("status", String.valueOf(resultBody.getStatus())));
    postParameters.add(new BasicNameValuePair("success", String.valueOf(resultBody.isSuccess())));
    
    httpPost.setEntity(new UrlEncodedFormEntity(postParameters));
    return httpClient.execute(httpPost, new BasicResponseHandler());
  }

}