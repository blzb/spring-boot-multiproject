package com.mopgp.framework.db.dbo.security

import com.mopgp.framework.db.dbo.cardex.Cardex
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

import javax.persistence.Entity
import javax.persistence.Id

@EqualsAndHashCode(includes='authority')
@ToString(includes='authority', includeNames=true, includePackage=false)
@Entity
class Role implements Serializable {
	@Id
	Long id

	private static final long serialVersionUID = 1

	String authority

    static hasMany = [cardexs: Cardex]

	static constraints = {
		authority blank: false, unique: true
	}

	static mapping = {
		cache true
	}
}
