package com.android.marsphotos.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

// Add  base URL for the web service.
private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"

// Add a Retrofit builder to build and create a Retrofit object.
private val retrofit = Retrofit.Builder()

// converter factory to build a web services API
// The converter tells Retrofit what to do with the data it gets back from the web service
// Retrofit to fetch a JSON response from the web service, and return it as a String
// Retrofit has a ScalarsConverter that supports strings and other primitive types,
    .addConverterFactory(ScalarsConverterFactory.create())

// Add the base URI for the web service using baseUrl() method
    .baseUrl(BASE_URL)

//call build() to create the Retrofit object.
    .build()

