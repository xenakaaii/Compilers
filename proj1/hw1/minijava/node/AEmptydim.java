/* This file was generated by SableCC (http://www.sablecc.org/). */

package minijava.node;

import minijava.analysis.*;

@SuppressWarnings("nls")
public final class AEmptydim extends PEmptydim
{
    private TLbrack _lbrack_;
    private TRbrack _rbrack_;

    public AEmptydim()
    {
        // Constructor
    }

    public AEmptydim(
        @SuppressWarnings("hiding") TLbrack _lbrack_,
        @SuppressWarnings("hiding") TRbrack _rbrack_)
    {
        // Constructor
        setLbrack(_lbrack_);

        setRbrack(_rbrack_);

    }

    @Override
    public Object clone()
    {
        return new AEmptydim(
            cloneNode(this._lbrack_),
            cloneNode(this._rbrack_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEmptydim(this);
    }

    public TLbrack getLbrack()
    {
        return this._lbrack_;
    }

    public void setLbrack(TLbrack node)
    {
        if(this._lbrack_ != null)
        {
            this._lbrack_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lbrack_ = node;
    }

    public TRbrack getRbrack()
    {
        return this._rbrack_;
    }

    public void setRbrack(TRbrack node)
    {
        if(this._rbrack_ != null)
        {
            this._rbrack_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rbrack_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lbrack_)
            + toString(this._rbrack_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lbrack_ == child)
        {
            this._lbrack_ = null;
            return;
        }

        if(this._rbrack_ == child)
        {
            this._rbrack_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lbrack_ == oldChild)
        {
            setLbrack((TLbrack) newChild);
            return;
        }

        if(this._rbrack_ == oldChild)
        {
            setRbrack((TRbrack) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
