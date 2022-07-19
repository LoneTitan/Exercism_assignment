public class ComplexNumber {
    private final double real;
    private final double imag;
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imag = imaginary;
    }
    public double getReal() {
        return real;
    }
    public double getImag() {
        return imag;
    }
    public ComplexNumber times(ComplexNumber complexNumber) {
        return new ComplexNumber(real * complexNumber.real - imag * complexNumber.imag,
                imag * complexNumber.real + real * complexNumber.imag);
    }
    public ComplexNumber add(ComplexNumber complexNumber) {
        return new ComplexNumber(real + complexNumber.real, imag + complexNumber.imag);
    }
    public ComplexNumber minus(ComplexNumber complexNumber) {
        return new ComplexNumber(real - complexNumber.real, imag - complexNumber.imag);
    }
    public ComplexNumber div(ComplexNumber complexNumber) {
        final double denominator = complexNumber.real * complexNumber.real + complexNumber.imag * complexNumber.imag;
        return new ComplexNumber((real * complexNumber.real + imag * complexNumber.imag) / denominator,
                (imag * complexNumber.real - real * complexNumber.imag) / denominator);
    }
    public double abs() {
        return Math.sqrt(real * real + imag * imag);
    }
    public ComplexNumber conjugate() {
        return new ComplexNumber(real, -imag);
    }
    public ComplexNumber exponentialOf() {
        final double exp = Math.exp(real);
        return new ComplexNumber(exp * Math.cos(imag), exp * Math.sin(imag));
    }
}