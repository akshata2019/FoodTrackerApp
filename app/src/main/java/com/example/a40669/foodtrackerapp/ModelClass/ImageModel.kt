package com.example.a40669.foodtrackerapp.ModelClass

/**
 * Created by 40669 on 8/30/2019.
 */
class ImageModel {
    private var image_drawable: Int = 0
    private  var Name: String = "defaultvalue"


    fun getImage_drawables(): Int {
        return image_drawable
    }

    fun setImage_drawables(image_drawable: Int) {
        this.image_drawable = image_drawable
    }

    fun setName(Name: String) {
        this.Name = Name

    }

    fun getName(): String {
        return Name
    }

}