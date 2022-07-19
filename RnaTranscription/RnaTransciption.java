class RnaTranscription {
    String transcribe(String dnaStrand) {
        if(dnaStrand == null)
            throw new UnsupportedOperationException("dnaStrand is null");
            
        String s = "";
        for(int i = 0; i < dnaStrand.length(); i++){
            char ch = dnaStrand.charAt(i);
            if(ch == 'G'){
                s += 'C';
            }
            if(ch == 'C'){
                s += 'G';
            }
            if(ch == 'T'){
                s += 'A';
            }
            if(ch == 'A'){
                s += 'U';
            }
        }
        return s;
    }
}
