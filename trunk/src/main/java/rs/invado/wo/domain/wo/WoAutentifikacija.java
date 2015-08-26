package rs.invado.wo.domain.wo;

// Generated Dec 11, 2012 10:59:44 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * WoAutentifikacija generated by hbm2java
 */
@Entity
@Table(name = "WO_AUTENTIFIKACIJA", schema = "DAREX")
public class WoAutentifikacija implements java.io.Serializable {

	private WoAutentifikacijaId id;

	public WoAutentifikacija() {
	}

	public WoAutentifikacija(WoAutentifikacijaId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "partner", column = @Column(name = "PARTNER", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "vremeAutentifikacije", column = @Column(name = "VREME_AUTENTIFIKACIJE", nullable = false)),
			@AttributeOverride(name = "ip", column = @Column(name = "IP", nullable = false, length = 15)),
			@AttributeOverride(name = "dummy", column = @Column(name = "DUMMY", length = 2000)),
			@AttributeOverride(name = "idwouser", column = @Column(name = "IDWOUSER", precision = 22, scale = 0)),
			@AttributeOverride(name = "sessionid", column = @Column(name = "SESSIONID", length = 2000)) })
	public WoAutentifikacijaId getId() {
		return this.id;
	}

	public void setId(WoAutentifikacijaId id) {
		this.id = id;
	}

}