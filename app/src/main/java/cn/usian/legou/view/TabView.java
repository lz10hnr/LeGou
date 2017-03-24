package cn.usian.legou.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xingge on 2017/3/15.
 */

public class TabView extends ViewGroup {


    //每一行有多少子view
    private List<View> lineViews = new ArrayList<>();
    //所有的view
    private List<List<View>> allViews = new ArrayList<>();
    //每一行行高的集合
    private List<Integer> lineHeights = new ArrayList<>();
    public TabView(Context context) {
        super(context);
    }

    public TabView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TabView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TabView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    /**
     * 生成自己的layoutParams
     * @param attrs
     * @return
     */
    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new MarginLayoutParams(getContext(),attrs);
    }

    /**
     * 根据子view的宽和高测量出自己的宽和高  包裹内容的时候才需要onMeasure
     * @param widthMeasureSpec
     * @param heightMeasureSpec
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = 0;//最大宽度 TabView的最终宽度
        int height = 0;//最大高度 TabView的最终高顿
        int lineWidth = 0;//每一行的宽度
        int lineHeight = 0;//每一行的高度

        //父view留给TabView的剩余空间
        int widthSpec = MeasureSpec.getSize(widthMeasureSpec);
        int heightSpec = MeasureSpec.getSize(heightMeasureSpec);
        Log.d("TabView", "widthSpec:" + widthSpec);

        //获取子view的数量
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++){
            //根据子view的索引获取子view
            View childView = getChildAt(i);
            //测量出每一个子view的宽和高
            measureChild(childView,widthMeasureSpec,heightMeasureSpec);
            //获取子view的宽度
            int childViewWidth = childView.getMeasuredWidth();
            //获取子view的高度
            int childViewHeight = childView.getMeasuredHeight();
            //子view的layoutParams的类型是由父view决定的
            MarginLayoutParams params = (MarginLayoutParams) childView.getLayoutParams();
            int leftMargin = params.leftMargin;
            int rightMargin = params.rightMargin;
            int topMargin = params.topMargin;
            int bottomMargin = params.bottomMargin;
            //自身实际占的位置
            childViewWidth = childViewWidth+leftMargin+rightMargin;
            childViewHeight = childViewHeight+topMargin+bottomMargin;
            //如果这一行所有子view的宽度加载一起大于父view剩余的宽度 换行
            //lineWidth是已经确定好的子view的宽度的和  childViewWidth当前确定的子view的宽度
            if(lineWidth + childViewWidth > widthSpec){
                width = Math.max(width,lineWidth);
                height = height + lineHeight;
                lineWidth = childViewWidth;
                lineHeight = childViewHeight;

            }else {
                //不换行 往后追加 技术lineWidth的宽度
                lineWidth = lineWidth + childViewWidth;
                lineHeight = Math.max(lineHeight,childViewHeight);
            }

            //最后一个子view的下标
            if(i == childCount - 1){
                width = Math.max(width,lineWidth);
                height = height + lineHeight;
            }
        }

        //确定TabView实际的宽度和高度
        if(widthMeasureSpec == MeasureSpec.EXACTLY){
            setMeasuredDimension(widthSpec,heightSpec);
        }else if(widthMeasureSpec == MeasureSpec.AT_MOST){
            setMeasuredDimension(width,height);
        }
    }

    /**
     * 确定每一个item的位置并且根据位置绘制到屏幕上
     * @param changed
     * @param l
     * @param t
     * @param r
     * @param b
     */
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

        int width = getWidth();
        int left = 0;
        int top = 0;

        int lineWidth = 0;
        int lineHeight = 0;
        int childCount = getChildCount();
        for(int i = 0; i < childCount; i++){

            View childView = getChildAt(i);
            int childWidth = childView.getMeasuredWidth();
            int childHeight = childView.getMeasuredHeight();
            MarginLayoutParams params = (MarginLayoutParams) childView.getLayoutParams();
            childWidth = params.leftMargin+childWidth+params.rightMargin;
            childHeight = params.topMargin+childHeight+params.bottomMargin;
            if(lineWidth + childWidth > width){
                allViews.add(lineViews);
                lineHeights.add(lineHeight);
                lineViews = new ArrayList<>();
                lineWidth = 0;
            }
            lineWidth = lineWidth+childWidth;
            lineHeight = Math.max(lineHeight,childHeight);
            lineViews.add(childView);

            if(i == childCount - 1){
                allViews.add(lineViews);
                lineHeights.add(lineHeight);
            }

        }


        for (int i = 0; i < allViews.size(); i++){

            int itemlineHeight = lineHeights.get(i);
            List<View> lineViews = allViews.get(i);

            for (int j = 0; j < lineViews.size(); j++){

                View childView = lineViews.get(j);

                //获取子view的宽度
                int childViewWidth = childView.getMeasuredWidth();
                //获取子view的高度
                int childViewHeight = childView.getMeasuredHeight();
                //子view的layoutParams的类型是由父view决定的
                MarginLayoutParams params = (MarginLayoutParams) childView.getLayoutParams();
                int leftMargin = params.leftMargin;
                int rightMargin = params.rightMargin;
                int topMargin = params.topMargin;
                int bottomMargin = params.bottomMargin;

                int itemLeft = left + leftMargin;
                int itemTop = top + topMargin;
                int itemRight = itemLeft + childViewWidth;
                int itemBottom = itemTop + childViewHeight;

                childView.layout(itemLeft,itemTop,itemRight,itemBottom);

//                left = left + itemRight;
                left = left + childViewWidth + leftMargin + rightMargin;;

            }

            left = 0;
            top = top + itemlineHeight;

        }


    }
}
