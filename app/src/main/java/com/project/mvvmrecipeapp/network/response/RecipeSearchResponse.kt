package com.project.mvvmrecipeapp.network.response


import com.google.gson.annotations.SerializedName
import com.project.mvvmrecipeapp.network.model.RecipeDto

data class RecipeSearchResponse(

    @SerializedName("count")
    var count: Int,

    @SerializedName("results")
    var recipes: List<RecipeDto>,
)