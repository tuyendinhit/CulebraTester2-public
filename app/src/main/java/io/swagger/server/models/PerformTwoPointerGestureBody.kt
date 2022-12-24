/**
* CulebraTester
* ## Snaky Android Test --- If you want to be able to try out the API using the **Execute** or **TRY** button from this page - an android device should be connected using `adb` - the server should have been started using `./culebratester2 start-server`  then you will be able to invoke the API and see the responses. 
*
* OpenAPI spec version: 2.0.64
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/package io.swagger.server.models

import io.swagger.server.models.Point

/**
 * The body for a **two pointer gesture** action. * @param startPoint1  * @param startPoint2  * @param endPoint1  * @param endPoint2  * @param steps the number of steps for the gesture. Steps are injected about 5 milliseconds apart, so 100 steps may take around 0.5 seconds to complete.*/
data class PerformTwoPointerGestureBody (    val startPoint1: Point,    val startPoint2: Point,    val endPoint1: Point,    val endPoint2: Point,    /* the number of steps for the gesture. Steps are injected about 5 milliseconds apart, so 100 steps may take around 0.5 seconds to complete. */
    val steps: kotlin.Int
) {
}
