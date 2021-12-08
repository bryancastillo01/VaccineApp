package com.misiontic2022.aplicacionnueva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.misiontic2022.aplicacionnueva.databinding.ActivityVistaMapaBinding

class VistaMapa : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityVistaMapaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityVistaMapaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val oficina = LatLng(4.6793177650746784, -74.05704207638186)
        mMap.addMarker(MarkerOptions().position(oficina).title("Marker in Oficina"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oficina, 20F))

        val bodega = LatLng(4.642304363085537, -74.11365846103796)
        mMap.addMarker(MarkerOptions().position(bodega).title("Marker in Bodega"))
        mMap.mapType = GoogleMap.MAP_TYPE_NORMAL
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bodega, 20.0F))
    }
}