package net.sample.welcome;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class WelcomeShow extends View {
	public WelcomeShow(Context context){
		super(context);
		setBackgroundColor(Color.WHITE);
	}
	
	protected void onDraw(Canvas canvas){
		canvas.drawText("Welcome Andriud World Touch git hub push!",
				0, 12, new Paint());
	}
}
