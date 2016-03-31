package ch.epfl.data
package dblab
package deep
package dsls

import sc.pardis.quasi.anf.BaseQuasiExp
import sc.pardis.ir._
import sc.pardis.types.PardisTypeImplicits._
import sc.pardis.deep._
import sc.pardis.language._
import sc.pardis.deep.scalalib._
import sc.pardis.deep.scalalib.collection._
import sc.pardis.deep.scalalib.io._
import dblab.deep.queryengine._
import dblab.deep.storagemanager._
import dblab.deep.common._
import dblab.deep.schema._

trait CScalaDSL extends ScalaCoreDSL
  with CScalaExtra
  with ch.epfl.data.sc.cscala.deep.DeepCScala

trait ScalaCoreDSL extends CharComponent
  with DoubleComponent
  with IntComponent
  with LongComponent
  with BooleanComponent
  with ArrayComponent
  with SeqComponent
  with PrintStreamComponent
  with OptimalStringComponent
  with FastScannerComponent
  with IntegerComponent
  with HashMapComponent
  with SetComponent
  with TreeSetComponent
  with ArrayBufferComponent
  with Tuple2Component
  with Tuple3Component
  with Tuple4Component
  with Tuple9Component
  with MultiMapComponent
  with OptionComponent
  with StringComponent
  with ContComponent
  with RangeComponent
  with OrderingOps
  with ArrayExtraOps
  with TreeSetExtraOps

trait ScalaCoreDSLPartialEvaluation extends ScalaCoreDSL
  with DoublePartialEvaluation
  with IntPartialEvaluation
  with LongPartialEvaluation
  with BooleanPartialEvaluation

trait QPlanDSL extends queryengine.push.OperatorsComponent
  with AGGRecordComponent
  with WindowRecordComponent
  with GenericEngineComponent
  with LoaderComponent
  with SchemaOps
  with LoaderInlined

trait QMonadDSL extends GenericEngineComponent
  with LoaderComponent
  with monad.GroupedQueryComponent
  with monad.QueryComponent
  with monad.JoinableQueryComponent
  with monad.QueryInlined
  with SchemaOps
  with LoaderInlined

case object MCHLanguage extends Language(MCLanguage)
case object MCLanguage extends Language(ScalaCoreLanguage)
case object QMonadLanguage extends Language
