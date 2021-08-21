package com.example.ioasystest.common.extensions

import android.view.View

fun View.setVisible(){
    this.visibility = View.VISIBLE
}

fun View.setGone(){
    this.visibility = View.GONE
}