package de.xeqo.a.a;

public final class CameraIdStruc {
    private int vendorId;
    private int productId;

    public CameraIdStruc(int vendorId, int productId) {
        this.vendorId = vendorId;
        this.productId = productId;
    }

    public final int hashCode() {
        return ((this.productId + 31) * 31) + this.vendorId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        CameraIdStruc nVar = (CameraIdStruc) obj;
        if (this.productId != nVar.productId) {
            return false;
        }
        if (this.vendorId != nVar.vendorId) {
            return false;
        }
        return true;
    }
}
