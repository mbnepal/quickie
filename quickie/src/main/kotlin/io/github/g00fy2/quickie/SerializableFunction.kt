package io.github.g00fy2.quickie

import android.os.Parcelable
import android.util.Log
import kotlinx.parcelize.Parcelize
import java.io.Serializable

@Parcelize
public class SerializableFunction(private val action: () -> Unit) : Serializable, Parcelable {
  fun invoke(): Boolean {
    return try {
      action.invoke()
      true
    } catch (e: Exception) {
      Log.e("Qr Code scanner", "Failed to invoke on click action.")
      false
    }
  }
}