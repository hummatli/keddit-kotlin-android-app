@file:JvmName("ExtensionsUtils")

package com.mobapphome.keddit.commons.extensions

/**
 * Created by settar on 6/18/17.
 */

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}