package mx.edu.itson.potros.examenu2
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

data class Item(val image: Int, val price: String)

class CatalogoGridActivity : AppCompatActivity() {

    private val detallesItems = listOf(
        Item(R.drawable.cumplebotanas, "$280"),
        Item(R.drawable.cumplecheve, "$320"),
        Item(R.drawable.cumpleescolar, "$330"),
        Item(R.drawable.cumplepaletas, "$190"),
        Item(R.drawable.cumplesnack, "$150"),
        Item(R.drawable.cumplevinos, "$370")
    )

    private val globosItems = listOf(
        Item(R.drawable.globoamor, "$240"),
        Item(R.drawable.globocumple, "$820"),
        Item(R.drawable.globofestejo, "$260"),
        Item(R.drawable.globonum, "$760"),
        Item(R.drawable.globoregalo, "$450"),
        Item(R.drawable.globos, "$240")
    )

    private val peluchesItems = listOf(
        Item(R.drawable.peluchemario, "$320"),
        Item(R.drawable.pelucheminecraft, "$320"),
        Item(R.drawable.peluchepeppa, "$290"),
        Item(R.drawable.peluches, "$260"),
        Item(R.drawable.peluchesony, "$330"),
        Item(R.drawable.peluchestich, "$280")
    )

    private val regalosItems = listOf(
        Item(R.drawable.regaloazul, "$80"),
        Item(R.drawable.regalobebe, "$290"),
        Item(R.drawable.regalocajas, "$140"),
        Item(R.drawable.regalocolores, "$85"),
        Item(R.drawable.regalos, "$200"),
        Item(R.drawable.regalovarios, "$75")

    )

    private val tazasItems = listOf(
        Item(R.drawable.tazaabuela, "$120"),
        Item(R.drawable.tazalove, "$120"),
        Item(R.drawable.tazaquiero, "$260"),
        Item(R.drawable.tazas, "$280")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.regalos)

        val category = intent.getStringExtra("category")
        val gridView: GridView = findViewById(R.id.peluches)

        val items = when (category) {
            "Detalles" -> detallesItems
            "Globos" -> globosItems
            "Peluches" -> peluchesItems
            "Regalos" -> regalosItems
            "Tazas" -> tazasItems
            else -> emptyList()
        }

        val adapter = GridAdapter(this, items)
        gridView.adapter = adapter
    }
}
