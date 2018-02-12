/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.content

import android.os.Binder
import android.os.Bundle
import android.os.Parcelable
import android.support.annotation.RequiresApi
import android.util.Size
import android.util.SizeF
import android.util.SparseArray
import java.io.Serializable

/**
 * Puts [Byte] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: Byte): Bundle {
    putByte(key, value)
    return this
}

/**
 * Puts [ByteArray] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: ByteArray): Bundle {
    putByteArray(key, value)
    return this
}

/**
 * Puts [Short] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: Short): Bundle {
    putShort(key, value)
    return this
}

/**
 * Puts [ShortArray] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: ShortArray): Bundle {
    putShortArray(key, value)
    return this
}

/**
 * Puts [Int] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: Int): Bundle {
    putInt(key, value)
    return this
}

/**
 * Puts [IntArray] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: IntArray): Bundle {
    putIntArray(key, value)
    return this
}

/**
 * Puts [Int] [ArrayList] value into [Bundle] and returns [Bundle]
 */
fun Bundle.putArrayListOfInt(key: String, value: ArrayList<Int>): Bundle {
    putIntegerArrayList(key, value)
    return this
}

/**
 * Puts [Long] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: Long): Bundle {
    putLong(key, value)
    return this
}

/**
 * Puts [LongArray] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: LongArray): Bundle {
    putLongArray(key, value)
    return this
}

/**
 * Puts [Float] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: Float): Bundle {
    putFloat(key, value)
    return this
}

/**
 * Puts [FloatArray] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: FloatArray): Bundle {
    putFloatArray(key, value)
    return this
}

/**
 * Puts [Double] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: Double): Bundle {
    putDouble(key, value)
    return this
}

/**
 * Puts [DoubleArray] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: DoubleArray): Bundle {
    putDoubleArray(key, value)
    return this
}

/**
 * Puts [Boolean] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: Boolean): Bundle {
    putBoolean(key, value)
    return this
}

/**
 * Puts [BooleanArray] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: BooleanArray): Bundle {
    putBooleanArray(key, value)
    return this
}

/**
 * Puts [String] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: String): Bundle {
    putString(key, value)
    return this
}

/**
 * Puts [String] [Array] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: Array<String>): Bundle {
    putStringArray(key, value)
    return this
}

/**
 * Puts [String] [ArrayList] value into [Bundle] and returns [Bundle]
 */
fun Bundle.putArrayListOfString(key: String, value: ArrayList<String>): Bundle {
    putStringArrayList(key, value)
    return this
}

/**
 * Puts [Binder] value into [Bundle] and returns [Bundle]
 */
@RequiresApi(18)
fun Bundle.put(key: String, value: Binder): Bundle {
    putBinder(key, value)
    return this
}

/**
 * Puts [Bundle] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: Bundle): Bundle {
    putBundle(key, value)
    return this
}

/**
 * Copies [Bundle] values into [Bundle] and returns [Bundle]
 */
fun Bundle.copyFrom(value: Bundle): Bundle {
    putAll(value)
    return this
}

/**
 * Puts [Parcelable] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: Parcelable): Bundle {
    putParcelable(key, value)
    return this
}

/**
 * Puts [Parcelable] [Array] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: Array<Parcelable>): Bundle {
    putParcelableArray(key, value)
    return this
}

/**
 * Puts [Parcelable] [ArrayList] value into [Bundle] and returns [Bundle]
 */
fun Bundle.putArrayListOfParcelable(key: String, value: ArrayList<Parcelable>): Bundle {
    putParcelableArrayList(key, value)
    return this
}

/**
 * Puts [Parcelable] [SparseArray] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: SparseArray<Parcelable>): Bundle {
    putSparseParcelableArray(key, value)
    return this
}

/**
 * Puts [Char] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: Char): Bundle {
    putChar(key, value)
    return this
}

/**
 * Puts [CharArray] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: CharArray): Bundle {
    putCharArray(key, value)
    return this
}

/**
 * Puts [CharSequence] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: CharSequence): Bundle {
    putCharSequence(key, value)
    return this
}

/**
 * Puts [CharSequence] [Array] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: Array<CharSequence>): Bundle {
    putCharSequenceArray(key, value)
    return this
}

/**
 * Puts [CharSequence] [ArrayList] value into [Bundle] and returns [Bundle]
 */
fun Bundle.putArrayListOfCharSequence(key: String, value: ArrayList<CharSequence>): Bundle {
    putCharSequenceArrayList(key, value)
    return this
}

/**
 * Puts [Serializable] value into [Bundle] and returns [Bundle]
 */
fun Bundle.put(key: String, value: Serializable): Bundle {
    putSerializable(key, value)
    return this
}

/**
 * Puts [Size] value into [Bundle] and returns [Bundle]
 */
@RequiresApi(21)
fun Bundle.put(key: String, value: Size): Bundle {
    putSize(key, value)
    return this
}

/**
 * Puts [SizeF] value into [Bundle] and returns [Bundle]
 */
@RequiresApi(21)
fun Bundle.put(key: String, value: SizeF): Bundle {
    putSizeF(key, value)
    return this
}