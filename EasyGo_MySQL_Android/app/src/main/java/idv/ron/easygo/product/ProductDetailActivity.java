package idv.ron.easygo.product;


import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import idv.ron.easygo.R;
import idv.ron.easygo.main.Common;

public class ProductDetailActivity extends AppCompatActivity {
    private final static String TAG = "ProductDetailActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_detail_activity);
        Product product = (Product) this.getIntent().getSerializableExtra("product");
        if (product == null) {
            Common.showToast(ProductDetailActivity.this, R.string.msg_NoProductsFound);
        } else {
            showDetail(product);
        }
    }

    public void showDetail(Product product) {
        ImageView imageView = (ImageView) findViewById(R.id.ivProductDetail);
        String url = Common.URL + "ProductServlet";
        int id = product.getId();
        int imageSize = 500;
        Bitmap bitmap = null;
        try {
            // passing null and calling get() means not to run FindImageByIdTask.onPostExecute()
            bitmap = new ProductGetImageTask(null).execute(url, id, imageSize).get();
        } catch (Exception e) {
            Log.e(TAG, e.toString());
        }

        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(R.drawable.default_image);
        }

        TextView textView = (TextView) findViewById(R.id.tvProductDetail);
        String productInfo = getString(R.string.col_Id) + ": " + product.getId() + "\n" +
                getString(R.string.col_Name) + ": " + product.getName() + "\n" +
                getString(R.string.col_Price) + ": " + product.getPrice() + "\n"
                + getString(R.string.col_Description) + ": " + product.getDescription();
        textView.setText(productInfo);
    }
}
