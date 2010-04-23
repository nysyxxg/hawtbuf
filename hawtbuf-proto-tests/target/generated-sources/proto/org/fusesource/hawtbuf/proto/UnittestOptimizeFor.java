//
// Generated by protoc, do not edit by hand.
//
package org.fusesource.hawtbuf.proto;

public class UnittestOptimizeFor {

   static public final class TestOptimizedForSize extends TestOptimizedForSizeBase<TestOptimizedForSize> {

      public java.util.ArrayList<String> missingFields() {
         java.util.ArrayList<String> missingFields = super.missingFields();
         if( hasMsg() ) {
            try {
               getMsg().assertInitialized();
            } catch (org.fusesource.hawtbuf.proto.UninitializedMessageException e){
               missingFields.addAll(prefix(e.getMissingFields(),"msg."));
            }
         }
         return missingFields;
      }

      public void clear() {
         super.clear();
         clearI();
         clearMsg();
      }

      public TestOptimizedForSize clone() {
         return new TestOptimizedForSize().mergeFrom(this);
      }

      public TestOptimizedForSize mergeFrom(TestOptimizedForSize other) {
         if (other.hasI()) {
            setI(other.getI());
         }
         if (other.hasMsg()) {
            if (hasMsg()) {
               getMsg().mergeFrom(other.getMsg());
            } else {
               setMsg(other.getMsg().clone());
            }
         }
         return this;
      }

      public int serializedSizeUnframed() {
         if (memoizedSerializedSize != -1)
            return memoizedSerializedSize;

         int size = 0;
         if (hasI()) {
            size += org.fusesource.hawtbuf.proto.CodedOutputStream.computeInt32Size(1, getI());
         }
         if (hasMsg()) {
            size += computeMessageSize(19, getMsg());
         }
         memoizedSerializedSize = size;
         return size;
      }

      public TestOptimizedForSize mergeUnframed(org.fusesource.hawtbuf.proto.CodedInputStream input) throws java.io.IOException {
         while (true) {
            int tag = input.readTag();
            if ((tag & 0x07) == 4) {
               return this;
            }
            switch (tag) {
            case 0:
               return this;
            default: {
               break;
            }
            case 8:
               setI(input.readInt32());
               break;
            case 154:
               if (hasMsg()) {
                  getMsg().mergeFramed(input);
               } else {
                  setMsg(new UnittestProto.ForeignMessage().mergeFramed(input));
               }
               break;
            }
         }
      }
      public void writeUnframed(org.fusesource.hawtbuf.proto.CodedOutputStream output) throws java.io.IOException {
         if (hasI()) {
            output.writeInt32(1, getI());
         }
         if (hasMsg()) {
            writeMessage(output, 19, getMsg());
         }
      }

      public static TestOptimizedForSize parseUnframed(org.fusesource.hawtbuf.proto.CodedInputStream data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException, java.io.IOException {
         return new TestOptimizedForSize().mergeUnframed(data).checktInitialized();
      }

      public static TestOptimizedForSize parseUnframed(org.fusesource.hawtbuf.Buffer data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException {
         return new TestOptimizedForSize().mergeUnframed(data).checktInitialized();
      }

      public static TestOptimizedForSize parseUnframed(byte[] data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException {
         return new TestOptimizedForSize().mergeUnframed(data).checktInitialized();
      }

      public static TestOptimizedForSize parseUnframed(java.io.InputStream data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException, java.io.IOException {
         return new TestOptimizedForSize().mergeUnframed(data).checktInitialized();
      }

      public static TestOptimizedForSize parseFramed(org.fusesource.hawtbuf.proto.CodedInputStream data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException, java.io.IOException {
         return new TestOptimizedForSize().mergeFramed(data).checktInitialized();
      }

      public static TestOptimizedForSize parseFramed(org.fusesource.hawtbuf.Buffer data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException {
         return new TestOptimizedForSize().mergeFramed(data).checktInitialized();
      }

      public static TestOptimizedForSize parseFramed(byte[] data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException {
         return new TestOptimizedForSize().mergeFramed(data).checktInitialized();
      }

      public static TestOptimizedForSize parseFramed(java.io.InputStream data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException, java.io.IOException {
         return new TestOptimizedForSize().mergeFramed(data).checktInitialized();
      }

      public String toString() {
         return toString(new java.lang.StringBuilder(), "").toString();
      }

      public java.lang.StringBuilder toString(java.lang.StringBuilder sb, String prefix) {
         if(  hasI() ) {
            sb.append(prefix+"i: ");
            sb.append(getI());
            sb.append("\n");
         }
         if(  hasMsg() ) {
            sb.append(prefix+"msg {\n");
            getMsg().toString(sb, prefix+"  ");
            sb.append(prefix+"}\n");
         }
         return sb;
      }

      public boolean equals(Object obj) {
         if( obj==this )
            return true;
         
         if( obj==null || obj.getClass()!=TestOptimizedForSize.class )
            return false;
         
         return equals((TestOptimizedForSize)obj);
      }
      
      public boolean equals(TestOptimizedForSize obj) {
         if (hasI() ^ obj.hasI() ) 
            return false;
         if (hasI() && ( getI()!=obj.getI() ))
            return false;
         if (hasMsg() ^ obj.hasMsg() ) 
            return false;
         if (hasMsg() && ( !getMsg().equals(obj.getMsg()) ))
            return false;
         return true;
      }
      
      public int hashCode() {
         int rc=692384277;
         if (hasI()) {
            rc ^= ( 73^getI() );
         }
         if (hasMsg()) {
            rc ^= ( 77665^getMsg().hashCode() );
         }
         return rc;
      }
      
   }

   static abstract class TestOptimizedForSizeBase<T> extends org.fusesource.hawtbuf.proto.BaseMessage<T> {

      // optional int32 i = 1;
      private int f_i = 0;
      private boolean b_i;

      public boolean hasI() {
         return this.b_i;
      }

      public int getI() {
         return this.f_i;
      }

      public T setI(int i) {
         loadAndClear();
         this.b_i = true;
         this.f_i = i;
         return (T)this;
      }

      public void clearI() {
         loadAndClear();
         this.b_i = false;
         this.f_i = 0;
      }

      // optional ForeignMessage msg = 19;
      private UnittestProto.ForeignMessage f_msg = null;

      public boolean hasMsg() {
         return this.f_msg!=null;
      }

      public UnittestProto.ForeignMessage getMsg() {
         if( this.f_msg == null ) {
            this.f_msg = new UnittestProto.ForeignMessage();
         }
         return this.f_msg;
      }

      public T setMsg(UnittestProto.ForeignMessage msg) {
         loadAndClear();
         this.f_msg = msg;
         return (T)this;
      }

      public void clearMsg() {
         loadAndClear();
         this.f_msg = null;
      }

   }

}