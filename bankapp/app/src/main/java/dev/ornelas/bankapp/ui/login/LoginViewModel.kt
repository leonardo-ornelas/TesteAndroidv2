package dev.ornelas.bankapp.ui.login

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

class LoginViewModel(
    val success: LoggedInUserView? = null,
    val error: Int? = null,
    val usernameError: Int? = null,
    val passwordError: Int? = null
)

@Parcelize
data class LoggedInUserView(
    val id: Int, val name: String, val bankAccount: String, val agency: String, val balance: Double
) : Parcelable