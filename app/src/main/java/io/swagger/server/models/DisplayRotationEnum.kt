/**
* CulebraTester
* ## Snaky Android Test --- If you want to be able to try out the API using the **Execute** or **TRY** button from this page - an android device should be connected using `adb` - the server should have been started using `./culebratester2 start-server`  then you will be able to invoke the API and see the responses. 
*
* OpenAPI spec version: 2.0.30
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/package io.swagger.server.models


/**
* the current display rotation
* Values: _0,_180,_270,_90
*/
enum class DisplayRotationEnum(val value: kotlin.Int){
    /**
     * The value is as defined in https://developer.android.com/reference/android/view/Surface.html
     * Notice they are different than the ones generated by Swagger.
     */
    _0(0),
    _180(2),
    _270(3),
    _90(1);

    // We need to companion object for the companion extension in DisplayRotationEnumCompanion
    companion object
}

