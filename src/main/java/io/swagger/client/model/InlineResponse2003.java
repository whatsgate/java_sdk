/*
 * API whatsgate.ru
 * Интерфейс для взаимодействия с клиентом Whatsapp
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.Media;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse2003
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-07T09:16:17.666Z[GMT]")
public class InlineResponse2003 {
  @SerializedName("result")
  private String result = null;

  @SerializedName("media")
  private Media media = null;

  public InlineResponse2003 result(String result) {
    this.result = result;
    return this;
  }

   /**
   * при удачном исполнении запроса содержит OK
   * @return result
  **/
  @Schema(description = "при удачном исполнении запроса содержит OK")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public InlineResponse2003 media(Media media) {
    this.media = media;
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  @Schema(description = "")
  public Media getMedia() {
    return media;
  }

  public void setMedia(Media media) {
    this.media = media;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.result, inlineResponse2003.result) &&
        Objects.equals(this.media, inlineResponse2003.media);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, media);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
