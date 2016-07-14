package com.mopgp.framework.db.dbo.rbi

import com.mopgp.framework.db.dbo.ubicacion.Asentamiento

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class UbicacionDelito {
	@Id
	Long id

	String calle
	String numeroExterior
	String numeroInterior
	Double longitud
	Double latitud
	//RBI rbi
	//static hasOne = [rbi: RBI]
	static belongsTo= [asentamiento: Asentamiento, rbi: RBI]

   static constraints = {
   }
}