package the_complete_reference.a1_super;

class Box {
    double width;
    double height;
    double depth;

    /*========================
            CONSTRUCTORS
     =========================
     */
    // Cloning a box
    Box(Box box){
        width = box.width;
        height = box.height;
        depth = box.depth;
    }

    // When all dimensions are specified
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // When no dimension are specified
    Box(){
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    // When cube is created
    Box(double len){
        this.width = this.height = this.depth = len; //idk
    }

    double volume(){
        return this.width * this.height * this.depth;
    }

}
