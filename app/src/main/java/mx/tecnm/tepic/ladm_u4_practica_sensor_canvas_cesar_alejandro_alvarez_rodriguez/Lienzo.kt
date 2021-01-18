package mx.tecnm.tepic.ladm_u4_practica_sensor_canvas_cesar_alejandro_alvarez_rodriguez

import android.R.attr.x
import android.R.attr.y
import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.view.View


class Lienzo(context: Context?) : View(context) {

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()
        var xTouch = 522f
        var yTouch = 764f

        val amazon = BitmapFactory.decodeResource(resources,R.drawable.sylveon)
        c.drawBitmap(amazon,(x-amazon.width/2),(y-amazon.height/2),p)
        invalidate()
    }
}