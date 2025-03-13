package mx.edu.itson.potros.examenu2
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CategoriaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.principal)

        val category = intent.getStringExtra("category")

        val buttonDetalles: Button = findViewById(R.id.button1)
        val buttonGlobos: Button = findViewById(R.id.button2)
        val buttonPeluches: Button = findViewById(R.id.button3)
        val buttonRegalos: Button = findViewById(R.id.button4)
        val buttonTazas: Button = findViewById(R.id.button5)

        buttonDetalles.setOnClickListener { openGridView("Detalles") }
        buttonGlobos.setOnClickListener { openGridView("Globos") }
        buttonPeluches.setOnClickListener { openGridView("Peluches") }
        buttonRegalos.setOnClickListener { openGridView("Regalos") }
        buttonTazas.setOnClickListener { openGridView("Tazas") }
    }

    private fun openGridView(category: String) {
        val intent = Intent(this, CatalogoGridActivity::class.java)
        intent.putExtra("category", category)
        startActivity(intent)
    }
}
