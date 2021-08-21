package com.example.ioasystest.common.extensions

import androidx.fragment.app.Fragment

fun Fragment.changeStatusBarColor(color: Int) {
    activity?.changeStatusBarColor(color)
}