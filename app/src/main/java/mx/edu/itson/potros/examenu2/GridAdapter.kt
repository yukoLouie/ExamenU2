package mx.edu.itson.potros.examenu2
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
class GridAdapter(private val context: Context, private val items: List<Item>) : BaseAdapter() {

    override fun getCount(): Int = items.size

    override fun getItem(position: Int): Any = items[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val item = items[position]
        val inflater = LayoutInflater.from(context)
        val view = convertView ?: inflater.inflate(R.layout.item_layout, parent, false)

        val imageView: ImageView = view.findViewById(R.id.articulo_image)
        val textView: TextView = view.findViewById(R.id.articulo_precio)

        imageView.setImageResource(item.image)
        textView.text = item.price

        return view
    }
}
