package com.devtvas.mygitportfolio.core

//
//import android.app.Activity
//import android.app.AlertDialog
//import android.content.Context
//import android.view.View
//import android.view.inputmethod.InputMethodManager
//import android.widget.ProgressBar
//import br.com.devtvas.app.R
//import com.google.android.material.dialog.MaterialAlertDialogBuilder
//import com.google.android.material.textfield.TextInputLayout
//
//var TextInputLayout.text: String
//    get() = editText?.text?.toString() ?: ""
//    set(value) {
//    editText?.setText(value)
//}
//
//fun View.hideSoftKeyboard() {
//    val imm = context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
//    imm.hideSoftInputFromWindow(windowToken,0)
//}
//
//fun Context.createDialog(block: MaterialAlertDialogBuilder.()-> Unit = {}): AlertDialog{
//    val builder = MaterialAlertDialogBuilder(this)
//    builder.setPositiveButton(android.R.string.ok,null)
//    block(builder)
//
//    return  builder.create()
//}
//fun Context.createProgressDialog(): AlertDialog {
//    return createDialog {
//        val padding = this@createProgressDialog.resources.getDimensionPixelOffset(R.dimen.layout_padding)
//        val processBar = ProgressBar(this@createProgressDialog)
//        processBar.setPadding(padding,padding,padding,padding)
//        setView(processBar)
//
//        setPositiveButton(null,null)
//        setCancelable(false)
//    }
//}
