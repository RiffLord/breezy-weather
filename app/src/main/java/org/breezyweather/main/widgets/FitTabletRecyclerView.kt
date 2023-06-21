package org.breezyweather.main.widgets

import android.content.Context
import android.util.AttributeSet
import org.breezyweather.common.ui.widgets.insets.FitSystemBarRecyclerView
import org.breezyweather.common.utils.DisplayUtils

class FitTabletRecyclerView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): FitSystemBarRecyclerView(
    context, attrs, defStyleAttr
) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val viewWidth = measuredWidth
        val adaptiveWidth = DisplayUtils.getTabletListAdaptiveWidth(context, viewWidth)
        val paddingHorizontal = (viewWidth - adaptiveWidth) / 2
        setPadding(paddingHorizontal, paddingTop, paddingHorizontal, paddingBottom)
    }
}