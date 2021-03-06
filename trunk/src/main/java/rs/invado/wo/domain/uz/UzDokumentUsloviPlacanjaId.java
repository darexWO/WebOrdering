package rs.invado.wo.domain.uz;

// Generated Jan 1, 2013 5:03:16 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UzDokumentUsloviPlacanjaId generated by hbm2java
 */
@Embeddable
public class UzDokumentUsloviPlacanjaId implements java.io.Serializable {

	private int idVd;
	private String idDokumenta;

	public UzDokumentUsloviPlacanjaId() {
	}

	public UzDokumentUsloviPlacanjaId(short idVd, String idDokumenta) {
		this.idVd = idVd;
		this.idDokumenta = idDokumenta;
	}

	@Column(name = "ID_VD", nullable = false, precision = 3, scale = 0)
	public int getIdVd() {
		return this.idVd;
	}

	public void setIdVd(int idVd) {
		this.idVd = idVd;
	}

	@Column(name = "ID_DOKUMENTA", nullable = false, length = 30)
	public String getIdDokumenta() {
		return this.idDokumenta;
	}

	public void setIdDokumenta(String idDokumenta) {
		this.idDokumenta = idDokumenta;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UzDokumentUsloviPlacanjaId))
			return false;
		UzDokumentUsloviPlacanjaId castOther = (UzDokumentUsloviPlacanjaId) other;

		return (this.getIdVd() == castOther.getIdVd())
				&& ((this.getIdDokumenta() == castOther.getIdDokumenta()) || (this
						.getIdDokumenta() != null
						&& castOther.getIdDokumenta() != null && this
						.getIdDokumenta().equals(castOther.getIdDokumenta())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdVd();
		result = 37
				* result
				+ (getIdDokumenta() == null ? 0 : this.getIdDokumenta()
						.hashCode());
		return result;
	}

}
