package com.sphantix.androidunittest

import android.text.TextUtils
import java.util.regex.Pattern

class EmailValidator {
    var isValid = false
        private set

    companion object {
        /**
         * Email validation pattern.
         */
        val EMAIL_PATTERN = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
        )

        /**
         * Validates if the given input is a valid email address.
         *
         * @param email The email to validate.
         * @return `true` if the input is a valid email. `false` otherwise.
         */
        fun isValidEmail(email: CharSequence?): Boolean {
            return if (TextUtils.isEmpty(email)) {
                false
            } else EMAIL_PATTERN.matcher(email).matches()
        }
    }
}
