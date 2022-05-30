package com.example.todo_list

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.util.AttributeSet
import android.widget.TextView


@SuppressLint("AppCompatCustomView")
class TextGradient : TextView {
    constructor(context: Context?, attrs: AttributeSet?) : super(
        context,
        attrs
    ) {        // TODO Auto-generated constructor stub
    }

    constructor(context: Context?) : super(context) {}
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
    }

    override fun setText(text: CharSequence, type: BufferType?) {
        val tvTodoTitle = findViewById<TextView>(R.id.tvTodoTitle)

        val paint = tvTodoTitle.paint
        val width = paint.measureText(tvTodoTitle.text.toString())

        val shader: Shader = LinearGradient(
        0f, 0f, width, tvTodoTitle.textSize, intArrayOf(
        Color.parseColor("#10E0ED"),
        Color.parseColor("#9E22E9")
        ), null, Shader.TileMode.CLAMP
        )
        super.getPaint().shader = shader
        super.setText(text.toString(), type)
    }
}