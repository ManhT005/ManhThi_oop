package invalid_date_exception;


class ThoiGian {
    private int ngay;
    private int thang;
    private int nam;

    // Constructor
    public ThoiGian(int ngay, int thang, int nam) throws InvalidDateException {
        if (!isValidDate(ngay, thang, nam)) {
            throw new InvalidDateException("Ngày, tháng hoặc năm không hợp lệ: " +
                    "ngày=" + ngay + ", tháng=" + thang + ", năm=" + nam);
        }
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    // Phương thức kiểm tra ngày hợp lệ
    private boolean isValidDate(int ngay, int thang, int nam) {
        if (nam < 0 || thang < 1 || thang > 12) {
            return false;
        }

        // Số ngày tối đa trong mỗi tháng
        int[] ngayTrongThang = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Kiểm tra năm nhuận
        if (nam % 4 == 0 && (nam % 100 != 0 || nam % 400 == 0)) {
            ngayTrongThang[1] = 29; // Tháng 2 có 29 ngày
        }

        // Kiểm tra ngày
        return ngay >= 1 && ngay <= ngayTrongThang[thang - 1]; // so ngay phai duong va <= so ngay toi da trong thang
        														// [thang - 1] vi mang co chi so [0...11]
        
    }
    public String toString() {
        return "Ngày: " + ngay + ", Tháng: " + thang + ", Năm: " + nam;
    }
}