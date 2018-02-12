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
import android.os.Parcel
import android.os.Parcelable
import android.os.Parcelable.Creator
import android.util.Size
import android.util.SizeF
import android.util.SparseArray
import org.junit.Assert.assertEquals
import org.junit.Test

class BundleTest {

    @Test
    fun putTest() {
        val bundle = Bundle()
            .put("test", Byte.MAX_VALUE)
            .put("test", byteArrayOf(1, 2, 3))
            .put("test", Short.MAX_VALUE)
            .put("test", shortArrayOf(4, 5, 6))
            .put("test", Int.MAX_VALUE)
            .put("test", intArrayOf(7, 8, 9))
            .putArrayListOfInt("text", arrayListOf(1, 2, 3))
            .put("test", Long.MAX_VALUE)
            .put("test", longArrayOf(10, 11, 12))
            .put("test", Float.MAX_VALUE)
            .put("test", floatArrayOf(13f, 14f, 15f))
            .put("test", Double.MAX_VALUE)
            .put("test", doubleArrayOf(16.0, 17.0, 18.0))
            .put("test", true)
            .put("test", booleanArrayOf(true, false, true))
            .put("test", "test")
            .put("test", arrayOf("test1", "test2", "test3"))
            .putArrayListOfString("test", arrayListOf("test4", "test5", "test6"))
            .put("test", Binder())
            .put("test", Bundle())
            .put("test", ParcelableTest(0))
            .put("test", arrayOf(ParcelableTest(1), ParcelableTest(2), ParcelableTest(3)))
            .putArrayListOfParcelable("test", arrayListOf(ParcelableTest(4), ParcelableTest(4)))
            .put("test", SparseArray())
            .put("test", 'q')
            .put("test", charArrayOf('1', '3', 'l'))
            .put("test", "test".subSequence(0, 2))
            .putArrayListOfCharSequence(
                "test",
                arrayListOf("test".subSequence(0, 2), "1test".subSequence(0, 2))
            )
            .put("test", Size(16, 16))
            .put("test", SizeF(16f, 16f))

        val bundleCopy = Bundle().copyFrom(bundle)
            .put("test1", "test1")


        assertEquals(bundle.size(), 30)
        assertEquals(bundleCopy.size(), 31)
    }

    data class ParcelableTest(
        val int: Int = 5,
        val string: String = "test",
        val boolean: Boolean = true
    ) : Parcelable {
        constructor(parcel: Parcel) : this(
            parcel.readInt(),
            parcel.readString(),
            parcel.readByte() != 0.toByte()
        ) {
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeInt(int)
            parcel.writeString(string)
            parcel.writeByte(if (boolean) 1 else 0)
        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Creator<ParcelableTest> {
            override fun createFromParcel(parcel: Parcel): ParcelableTest {
                return ParcelableTest(parcel)
            }

            override fun newArray(size: Int): Array<ParcelableTest?> {
                return arrayOfNulls(size)
            }
        }

    }

}

