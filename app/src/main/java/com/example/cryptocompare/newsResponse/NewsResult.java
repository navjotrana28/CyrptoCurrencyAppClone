package com.example.cryptocompare.newsResponse;

public class NewsResult {

        private String Type;

        private String Message;

        private String[] Promoted;

        private String HasWarning;

        private Data[] Data;

        public String getType ()
        {
            return Type;
        }

        public void setType (String Type)
        {
            this.Type = Type;
        }

        public String getMessage ()
        {
            return Message;
        }

        public void setMessage (String Message)
        {
            this.Message = Message;
        }

        public String[] getPromoted ()
        {
            return Promoted;
        }

        public void setPromoted (String[] Promoted)
        {
            this.Promoted = Promoted;
        }

        public String getHasWarning ()
        {
            return HasWarning;
        }

        public void setHasWarning (String HasWarning)
        {
            this.HasWarning = HasWarning;
        }

        public Data[] getData ()
        {
            return Data;
        }

        public void setData (Data[] Data)
        {
            this.Data = Data;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [RateLimit =  Type = "+Type+", Message = "+Message+", Promoted = "+Promoted+", HasWarning = "+HasWarning+", Data = "+Data+"]";
        }
    }
