package tailcall.runtime.transcoder

/**
 * A transcoder is a function that takes an A and returns a
 * B, or an error. It can be composed using the >>> operator
 * with other transcoders to create a pipeline. A transcoder
 * between A ~> C can be derived provided there exists a B
 * such that a transcoder from A ~> B exists and a
 * transcoder from B ~> C already exists.
 */

object Transcoder
    extends Config2Blueprint
    with Document2Blueprint
    with DynamicValue2InputValue
    with DynamicValue2JsonAST
    with DynamicValue2ResponseValue
    with InputValue2DynamicValue
    with Json2DynamicValue
    with Orc2Blueprint
    with Primitive2Value
    with ResponseValue2DynamicValue